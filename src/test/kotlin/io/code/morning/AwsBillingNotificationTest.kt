/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package io.code.morning

import org.junit.jupiter.api.Test
import org.junit.Assert.assertEquals


class AwsBillingNotificationTest {

  @Test
  fun `return hello`() {
    val lambda = AwsBillingNotification()
    assertEquals("hello", lambda.call())
  }
}
