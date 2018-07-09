package io.github.nebubit.guru.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

	/**
	* 
	* Error: Consider defining a bean of type 'guru.springframework.norris.chuck.ChuckNorrisQuotes' 
	* in your configuration.
	* 
	* Since ChuckNorrisQuotes is not a Component, we have to define this in configuration.
	* 
	**/
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
    	this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    // public JokeServiceImpl() {
    //     this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    // }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
