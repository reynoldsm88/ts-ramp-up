package com.twosixlabs.homework.controller

import javax.servlet.ServletContext
import org.scalatra.LifeCycle

import com.twosixlabs.homework.model.MyAlbumReviewJsonImplementation

class ScalatraInit extends LifeCycle {

    // bonus - what does mixing in traits like this replace from a java context?
    override def init( context : ServletContext ) : Unit = context.mount( new AlbumReviewController with MyAlbumReviewJsonImplementation, "/*" )

}
