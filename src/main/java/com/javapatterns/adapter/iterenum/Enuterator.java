package com.javapatterns.adapter.iterenum;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Enumeration;

public class Enuterator implements Iterator
{
	Enumeration enum1;

    public Enuterator(Enumeration enum1)
    {
		this.enum1 = enum1;
    }

    public boolean hasNext()
    {
		return enum1.hasMoreElements();
    }

    public Object next() throws NoSuchElementException
    {
        return enum1.nextElement();
    }

    public void remove()
    {
		throw new UnsupportedOperationException();
    }

}
