package dao

import com.mongodb.casbah.commons.MongoDBObject
import db.MongoDB
import model.Category


class CategoryDao {

  private val collection = "category"
  def save(category: Category) {
     
    val categoryObj = buildMongoDbObject(category)
	val result = MongoDB.getCollection(collection).save(categoryObj)
    
//    val mongo = MongoClient("localhost")
// 	val coll = mongo("test")("categories")
// 	coll.dropCollectionO
// 	val pf = MongoDBObject("name" -> "walk")	                       
//	coll += pf

//    val category = new Category("walk")
//    CategoryDao.save(category)
  }
  
  private def buildMongoDbObject(category: Category): MongoDBObject = {    
    val builder = MongoDBObject.newBuilder
	builder += "name" -> category.name 
	builder.result
  }
}