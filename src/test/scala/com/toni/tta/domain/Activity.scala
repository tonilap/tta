package com.toni.tta.domain

object Activity {
	
  case class Activity(category:Category, name: String)
  def save {
    val activity = new Activity
    activityDao.insert(activity)
  }
}