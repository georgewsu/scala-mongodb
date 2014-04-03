import com.typesafe.scalalogging.slf4j.StrictLogging

object HelloWorld extends Application with StrictLogging {
  logger.info("Hello World")
}
