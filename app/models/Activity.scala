package models

import java.util.Date

/**
 * @author tonilap
 * 
 * Activity model
 */
case class Activity(id:Long, name: String, category: String, start: Date, end: Date)

/**
 * Activity DAO
 */
object Activity {

  var activities = Set[Activity]()
  
  /**
   * Gets the list of activities sorted by name
   */
  def findAll = activities.toList.sortBy(_.name)
  
  /**
   * Gets the activity with the specified id
   */
  def findById(id: Long) = activities.find(_.id == id)
  /**
   * Adds a new Activity
   */
  def add(activity: Activity) = {
    activities = activities + activity
  }
  
}