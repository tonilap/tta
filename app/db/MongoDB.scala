package db

import com.mongodb.casbah.MongoConnection
import com.mongodb.casbah.MongoClient
import com.mongodb.casbah.MongoCollection

object MongoDB {
  
  private val SERVER = "localhost"
  private val DB = "test"
  
  def getConnection: MongoClient = return MongoClient(SERVER)
  
  def getCollection(collection: String): MongoCollection = 
    return getConnection(DB)(collection)
    
  def close {
    getConnection.close
  }
  
}