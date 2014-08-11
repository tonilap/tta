package controllers

import models.Activity
import play.api.mvc.Action
import play.api.mvc.Controller
import play.api.data.Form
import play.api.data.Forms._
import models.Category
import play.api.i18n.Messages
import play.api.mvc.Flash

/**
 * @author tonilap
 * 
 * Activities controller
 */
object Activities extends Controller {
 

  private val activityForm: Form[Activity] = Form(
      mapping(
          "name" -> nonEmptyText,
          "category" -> nonEmptyText.verifying("Category not exists (1)!", Category.findOne(_) == 1) ,
          "start" -> date("yyyy-MM-dd"),
          "end" -> date("yyyy-MM-dd")
          )(Activity.apply)(Activity.unapply)
      )
  
  /**
   * Action to get the list of activities  
   */
  def list = Action { implicit request =>
    val activities = Activity.findAll
    Ok(views.html.activities.list(activities))
  }
  
  /**
   * Action to get an activity details
   */
  def show(name: String) = Action { implicit request =>
    Activity.findByName(name).map { activity =>
      Ok(views.html.activities.details(activity))
    }.getOrElse(NotFound)
  }
  /**
   * Creates a new activity
   */
  def save = Action { implicit request => 
    val newActivityForm = activityForm .bindFromRequest()
    
    newActivityForm.fold(
        hasErrors = { form => Redirect(routes.Activities.newActivity)
          .flashing(Flash(form.data) + ("error" -> Messages("validation.errors")))}, 
        success = { newActivity => 
          Activity.add(newActivity)
          val message = Messages("activities.new.success", newActivity.name)
          Redirect(routes.Activities.show(newActivity.name)).flashing("success" -> message)
        }
      )
  }
  
  def newActivity = Action { implicit request =>
    val form = 
      if(flash.get("error").isDefined)
        activityForm.bind(flash.data)
      else
    	activityForm  
    Ok(views.html.activities.editActivity(form))
  }
}