package com.toni.tta.domain

import com.toni.tta.db.MongoSetup

object Category {
  
  case class Category(name: String)
  
  def save {
    val category = new Category("walk")
    CategoryDao.save(category)
  }
}

object CategoryDAO extends SalatDAO[Category, ObjectId](collection = MongoSetup.mongoDB("category"))