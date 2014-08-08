package db

import com.mongodb.casbah.MongoConnection

object MongoSetup {
  
  val mongo = MongoConnection()("test")
}