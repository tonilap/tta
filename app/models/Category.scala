package models

case class Category(name: String)

object Category {
  
  var categories = Set(Category("Home"),Category("Work"),Category("Walk"),
      Category("Internet"),Category("Personal app"))
  
  def findAll = categories.toList
}

