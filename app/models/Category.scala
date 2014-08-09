package model

case class Category(name: String)

object Category {
  
  var categories = Set("Home","Work","Walk","Internet","Personal app")
  
  def findAll = categories.toList.sortBy(_.name)
}

