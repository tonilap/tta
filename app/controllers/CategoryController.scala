package controllers

import play.api._
import play.api.mvc._
import model.Category


class CategoryController extends Controller{

  def testMethodForPlayCategory = Action { implicit request =>
    Category.save                  
    Ok("Stored data in database")
  }
}