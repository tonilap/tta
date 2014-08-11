package controllers

import models.Activity
import play.api.mvc.Action
import play.api.mvc.Controller
import play.api.data.Form
import play.api.data.Forms._
import models.Category

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
}