package com.ignyte.whatsshowing;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.2
 * Mon Oct 19 00:35:46 IST 2009
 * Generated source version: 2.2.2
 * 
 */
 
@WebService(targetNamespace = "http://www.ignyte.com/whatsshowing", name = "MovieInformationSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface MovieInformationSoap {

    @WebResult(name = "GetUpcomingMoviesResult", targetNamespace = "http://www.ignyte.com/whatsshowing")
    @ResponseWrapper(localName = "GetUpcomingMoviesResponse", targetNamespace = "http://www.ignyte.com/whatsshowing", className = "com.ignyte.whatsshowing.GetUpcomingMoviesResponse")
    @RequestWrapper(localName = "GetUpcomingMovies", targetNamespace = "http://www.ignyte.com/whatsshowing", className = "com.ignyte.whatsshowing.GetUpcomingMovies")
    @WebMethod(operationName = "GetUpcomingMovies", action = "http://www.ignyte.com/whatsshowing/GetUpcomingMovies")
    public com.ignyte.whatsshowing.ArrayOfUpcomingMovie getUpcomingMovies(
        @WebParam(name = "month", targetNamespace = "http://www.ignyte.com/whatsshowing")
        int month,
        @WebParam(name = "year", targetNamespace = "http://www.ignyte.com/whatsshowing")
        int year
    );

    @WebResult(name = "GetTheatersAndMoviesResult", targetNamespace = "http://www.ignyte.com/whatsshowing")
    @ResponseWrapper(localName = "GetTheatersAndMoviesResponse", targetNamespace = "http://www.ignyte.com/whatsshowing", className = "com.ignyte.whatsshowing.GetTheatersAndMoviesResponse")
    @RequestWrapper(localName = "GetTheatersAndMovies", targetNamespace = "http://www.ignyte.com/whatsshowing", className = "com.ignyte.whatsshowing.GetTheatersAndMovies")
    @WebMethod(operationName = "GetTheatersAndMovies", action = "http://www.ignyte.com/whatsshowing/GetTheatersAndMovies")
    public com.ignyte.whatsshowing.ArrayOfTheater getTheatersAndMovies(
        @WebParam(name = "zipCode", targetNamespace = "http://www.ignyte.com/whatsshowing")
        java.lang.String zipCode,
        @WebParam(name = "radius", targetNamespace = "http://www.ignyte.com/whatsshowing")
        int radius
    );
}