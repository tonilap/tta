package controllers

import play.api.mvc.Action
import play.api.mvc.Controller
import models.Category

object Categories extends Controller {

  def list = Action { implicit request =>
    val categories = Category.findAll
    Ok(views.html.categories.list(categories))
  }
}