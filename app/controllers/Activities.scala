package controllers

import models.Activity
import play.api.mvc.Action
import play.api.mvc.Controller

object Activities extends Controller {
 
  def list = Action { implicit request =>
    val activities = Activity.findAll
    Ok(views.html.activities.list(activities))
  }
}