package com.twosixlabs.homework.controller

import com.twosixlabs.homework.model.MyAlbumReviewJsonImplementation
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

    addServlet( new AlbumReviewController with MyAlbumReviewJsonImplementation, "/*" )

    //@formatter:off

    "GET all" should "return reply OK with a list of all the albums" in {
        get( "/reviews" ) {
            status shouldBe 200
        }
    }

    "GET for existing artist" should "reply OK with a list of reviews" in {
        get( "/review?artist=Amon Tobin" ) {
           status shouldBe 200
       }
    }

    "GET for artist" should "reply NotFound for an artist that doesn't exist" in {
        get( "review?artist=foobar" ) {
            status shouldBe 404
        }
    }

    "GET for existing album" should "reply OK with the album review for the title" in {
        get( "/review?album=Ride the Skies" ) {
            status shouldBe 200
        }
    }

    "GET for non-existing album" should "reply NotFound for the album does not exist" in {
        get( "review?artist=foobar" ) {
            status shouldBe 404
        }
    }

    "GET for average score for an artist" should "return the average of the given artist" in {
        get( "/scores/averages/Lightning Bolt" ) {
            status shouldBe 200
            response.body.toDouble shouldBe 3.4
        }
    }
}