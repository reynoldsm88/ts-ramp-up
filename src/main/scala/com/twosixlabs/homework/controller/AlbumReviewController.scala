package com.twosixlabs.homework.controller

import com.twosixlabs.homework.repository.AlbumRepository
import org.scalatra.{NotFound, Ok, ScalatraServlet}

class AlbumReviewController extends ScalatraServlet {

    val reviewsRepository : AlbumRepository = new AlbumRepository()

    //@formatter:off
   /**
     *
     * Should process paramters to decide what to return.
     *
     * Example url patterns are
     *
     * /review?artist=$artist_name - should return all the albums for that artist, or 404 not found if the artist does not exist
     *
     * there is some example code to help you understand how to deal with parameters.
     * also consult the relevant docs : http://scalatra.org/guides/2.5/http/routes.html
     *
     */
    get( "/reviews/:artist" ) {
        val artist : String = params( "artist" )
        if( !artist.isEmpty ){
            val reviewsByArtist : Option[ List[ (String,BigDecimal) ] ] = reviewsRepository.getAlbumsByArtist( artist ) // you need to implement the repository method
            if( reviewsByArtist.nonEmpty ){
                Ok( reviewsByArtist.mkString )
            }
            else NotFound()
        }
    }

    /**
      *
      * Should return the average score for all the albums by the artist
      *
      */
    get( "/reviews/average/:artist" ) {
       val artist : String = params( "artist" )
        if( !artist.isEmpty ){
            val reviewsByArtist : Option[ List[ (String,BigDecimal) ] ] = reviewsRepository.getAlbumsByArtist( artist ) // you need to implement the repository method
            if( reviewsByArtist.nonEmpty ){
                val reviews : List[ (String, BigDecimal) ] = reviewsByArtist.get
                val avgScore : BigDecimal = ??? // TODO - implement the logic to compute the average reveiw score
                Ok( avgScore )
            }
            else NotFound()
        }
    }
    //@formatter:on
}