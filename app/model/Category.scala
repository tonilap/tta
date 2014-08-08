package model

import org.bson.types.ObjectId
import com.novus.salat.dao.SalatDAO
import com.novus.salat.global.ctx
import db.MongoSetup
 
object Category {  
  def save {
    val category = new Category("walk")
    CategoryDao.save(category)
  }
}

case class Category(name: String)

object CategoryDao extends SalatDAO[Category, ObjectId](collection = MongoSetup.mongo("category"))