import scala.collection.JavaConverters._
import com.github.fakemongo.Fongo
import com.mongodb.DB
import com.mongodb.DBCollection

class CollectionTestSuite extends BaseTestSuite {

  val fongo = new Fongo("mongo server 1")

  test("Create and list collections") {
    val collectionName = "collection1"
    val db = fongo.getDB("db1")
    val collection = db.getCollection(collectionName)
    val collectionNames = db.getCollectionNames().asScala
    collectionNames should contain (collectionName)
  }

}
