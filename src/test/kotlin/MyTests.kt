import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class MyTests : BehaviorSpec({
    val logger: Logger = LoggerFactory.getLogger(MyTests::class.java)

    Given("a broomstick") {
        logger.info("Testing sample bbc")

        When("I sit on it") {
            logger.info("testing sample")
        }
        then("I should be able to fly") {
            logger.info("testing................")
            "abc" shouldBe "bbc"
        }
    }
})
