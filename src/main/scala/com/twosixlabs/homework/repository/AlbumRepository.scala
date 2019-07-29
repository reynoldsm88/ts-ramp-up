package com.twosixlabs.homework.repository

class AlbumRepository {

    /**
      *
      * Values are in the form of {"artist_name" -> [ {"album_name","score"}, {"album_name","score"}, {"album_name","score"}, ... ] }
      *
      */
    val albums : Map[ String, List[ (String, BigDecimal) ] ] = {
        Map( "Amon_Tobin" -> List( ("Bricoalage", 5.0), ("Supermodified", 4.5) ),
             "Lightning_Bolt" -> List( ("Ride_the_Skies", 3.0), ("Wonderful_Rainbow", 4.0), ("Fantasy_Empire", 4.0) ) )
    }

    def getAlbumsByArtist( artist : String ) : Option[ List[ (String, BigDecimal) ] ] = {
        ???
    }
}