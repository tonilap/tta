package models

/**
 * @author tonilap
 * 
 * Category model
 */
case class Category(name: String)

/**
 * Category Dao
 */
object Category {
  
  var categories = Set(Category("Home"),Category("Work"),Category("Walk"),
      Category("Internet"),Category("Personal app"))
  
  /**
   * Gets the list of categories
   */    
  def findAll = categories.toList
  
  /**
   * Gets the category with the specified name
   */
  def findOne(name: String) = categories.filter(_ == name)
}

