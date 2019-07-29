package com.twosixlabs.homework.controller

import org.scalatest.FlatSpecLike
import org.scalatra.test.scalatest.ScalatraSuite

/**
  *
  * Use this class to help drive the development of the AlbumReviewController.
  *
  * All of these tests must be passing, and you must add to them to validate that
  * the expected results are there
  *
  */
class AlbumReviewControllerTestSuite extends FlatSpecLike with ScalatraSuite {

    addServlet( new AlbumReviewController, "/*" )

    //@formatter:off


    "GET for existing artist" should "reply OK with a list of reviews" in {
        get( "/review?artist=Amon_Tobin" ) {
            response.body shouldBe "(Bricoalage,5.0)(Supermodified,4.5)"
            status shouldBe 200
       }
    }

    "GET for artist" should "reply NotFound for an artist that doesn't exist" in {
        get( "review?artist=foobar" ) {
            status shouldBe 404
        }
    }

    "GET for average score for an artist" should "return the average of the given artist" in {
        get( "/scores/averages/Lightning_Bolt" ) {
            response.status shouldBe 200
            BigDecimal( response.body ) shouldBe 3.666666666666666666666666666666667
        }
    }
}