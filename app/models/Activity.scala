package models

import java.util.Date

case class Activity(name: String, category: Category, start: Date, end: Date)

object Activity {

  var activities = Set[Activity]()
  
  def findAll = activities.toList.sortBy(_.name)
  
  def add(activity: Activity) = {
    activities = activities + activity
  }
  
}