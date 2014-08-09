object Categories extends Controller {

  def list = Action { implicit request =>
    val categories = Category.findAll
    Ok(views.html.categories.list(categories))
  }
}