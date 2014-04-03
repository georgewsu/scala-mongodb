import org.scalatest.BeforeAndAfter
import org.scalatest.BeforeAndAfterAll
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

abstract class BeforeAndAfterTestSuite extends FunSuite
    with BeforeAndAfterAll
    with BeforeAndAfter
    with ShouldMatchers {

  override def beforeAll() {
  }

  override def afterAll() {
  }

  before {
  }

  after {
  }

}
