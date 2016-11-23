package br.com.desciclopedia.designpatterns;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.ParseException;

import org.xml.sax.SAXException;

public class ThunderMegazord {

	public static int process(
			int a,
			int b,
			int c,
			int d,
			String file, 
			int size, 
			char type, 
			Object[] status, 
			int count, 
			String query, 
			String usr,
			String pwd, 
			String db, 
			String host, 
			int day, 
			int month, 
			int year, 
			int qtdSteps, 
			int stepsMax,
			int maxDistance, 
			String from, 
			String to, 
			Object... data) throws NullPointerException, ArrayIndexOutOfBoundsException, OutOfMemoryError, FileNotFoundException,
	SocketException, MalformedURLException, ArithmeticException, UnknownHostException, SAXException,
	ParseException, ClassNotFoundException, StackOverflowError, SQLException, IOException,
	InvocationTargetException, SecurityException, ClassCastException, NoSuchMethodException,
	NoSuchFieldException, UnsatisfiedLinkError, InstantiationException, ArrayStoreException,
	IllegalArgumentException, NumberFormatException, AssertionError, InternalError, RemoteException,
	RuntimeException, Exception, UnknownError, Error, Throwable{
		
		return a + b + c+ d + Megazord.process(file, size, type, status, count, query, usr, pwd, db, host, day, month, year, qtdSteps, stepsMax, maxDistance, from, to, data);
	}
}
