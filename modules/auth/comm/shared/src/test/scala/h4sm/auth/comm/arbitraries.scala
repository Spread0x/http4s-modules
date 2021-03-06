package h4sm.auth.comm

import org.scalacheck._

import h4sm.testutil.arbitraries._

object arbitraries {
  implicit val userRequestArb: Arbitrary[UserRequest] = Arbitrary {
    for {
      username <- nonEmptyString
      password <- nonEmptyString
    } yield UserRequest(username, password)
  }
}
