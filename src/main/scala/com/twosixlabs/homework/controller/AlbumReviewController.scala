package com.twosixlabs.homework.controller

import com.twosixlabs.homework.model.{AlbumReview, AlbumReviewFormat}
import org.scalatra.{NotFound, Ok, ScalatraServlet}

abstract class AlbumReviewController extends ScalatraServlet with AlbumReviewFormat {

    // TODO - implement this read method to populate the in memory database
    val reviews : List[ AlbumReview ] = readJsonDb()

    /**
      *
      * Return the full list of all album reviews
      *
      */
    //@formatter:off
    get( "/reviews" ) {
        Ok() // return the list of all the reviews
    }

   /**
     *
     * Should process paramters to decide what to return.
     *
     * Example url patterns are
     *
     * /review?artist=$artist_name - should return all the albums for that artist, or 404 not found if the artist does not exist
     * /review?title=$album_title - should return the review for that, or 404 if the review does not exist
     *
     *
     * there is some example code to help you understand how to deal with parameters.
     * also consult the relevant docs : http://scalatra.org/guides/2.5/http/routes.html
     *
     */
    get( "/review" ) {
        val artist : String = params( "artist" )
        if( !artist.isEmpty ){
            val reviewsByArtist : List[ AlbumReview ] = reviews.find( _.artist == artist ).toList
            if( reviewsByArtist.nonEmpty ){
                Ok( reviewsByArtist )
            }
            else NotFound()

        }
        ???
    }

    /**
      *
      * Should return the average score for all the albums by the artist
      *
      */
    get( "/scores/averages/:artist" ) {
        Ok() // return the list of all the reviews
    }
    //@formatter:on

    /**
      *
      * Use this method to read from the file src/main/resources/data/db.json
      * as a list of the AlbumReview domain object
      *
      * @return
      */
    private def readJsonDb( ) : List[ AlbumReview ] = ???
}