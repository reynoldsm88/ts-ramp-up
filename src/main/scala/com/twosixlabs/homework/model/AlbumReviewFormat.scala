package com.twosixlabs.homework.model

/**
  *
  * Interface definition for the JSON format of the AlbumReview domain object
  *
  */
trait AlbumReviewFormat {

    /**
      * Unmarshal the JSON and return an album review. Should return an album review if marshalling
      * succeeds, None if not
      *
      * @param json
      * @return Some( $album_review ) if it can marshal the JSON, None if not
      */
    def fromJson( json : String ) : Option[ AlbumReview ]

    /**
      * Write an AlbumReview as a JSON string
      *
      * @param review
      * @return Some( $json_str ) if marshalling is successful, None if not
      */
    def toJson( review : AlbumReview ) : Option[ String ]

}

/**
  *
  * Your implementation of the JSON format
  *
  */
trait MyAlbumReviewJsonImplementation extends AlbumReviewFormat {
    /**
      * Unmarshal the JSON and return an album review. Should return an album review if marshalling
      * succeeds, None if not
      *
      * @param json
      * @return Some( $album_review ) if it can marshal the JSON, None if not
      */
    override def fromJson( json : String ) : Option[ AlbumReview ] = ??? // implement me

    /**
      * Write an AlbumReview as a JSON string
      *
      * @param review
      * @return Some( $json_str ) if marshalling is successful, None if not
      */
    override def toJson( review : AlbumReview ) : Option[ String ] = ??? // implement me
}