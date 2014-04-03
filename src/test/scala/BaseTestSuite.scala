import org.scalatest.BeforeAndAfter
import org.scalatest.BeforeAndAfterAll
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import com.typesafe.scalalogging.slf4j.StrictLogging

abstract class BaseTestSuite extends FunSuite
    with BeforeAndAfterAll
    with BeforeAndAfter
    with ShouldMatchers
    with StrictLogging {

  override def beforeAll() {
    logger.debug("beforeAll")
  }

  override def afterAll() {
    logger.debug("afterAll")
  }

  before {
    logger.debug("before")
  }

  after {
    logger.debug("after")
  }

}
