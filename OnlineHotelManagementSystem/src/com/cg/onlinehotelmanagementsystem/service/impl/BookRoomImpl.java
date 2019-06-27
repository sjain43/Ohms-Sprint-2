package com.cg.onlinehotelmanagementsystem.service.impl;

import java.util.Map;

import com.cg.onlinehotelmanagementsystem.dto.ACRoomDetailsDTO;
import com.cg.onlinehotelmanagementsystem.dto.BookingDetailsDTO;
import com.cg.onlinehotelmanagementsystem.dto.KingRoomDetailsDTO;
import com.cg.onlinehotelmanagementsystem.dto.NonACRoomDetailsDTO;
import com.cg.onlinehotelmanagementsystem.dto.QueenRoomDetailsDTO;
import com.cg.onlinehotelmanagementsystem.exception.CancelBookingException;
import com.cg.onlinehotelmanagementsystem.exception.NoRoomAvailable;
import com.cg.onlinehotelmanagementsystem.exception.PersonExceedException;
import com.cg.onlinehotelmanagementsystem.exception.RoomAlreadyBookedException;
import com.cg.onlinehotelmanagementsystem.service.IBookRoom;
import com.cg.onlinehotelmanagementsystem.staticdb.ListData;

public class BookRoomImpl implements IBookRoom {
	Object bookRoom(Object object, int roomtype, ListData listdata, int numberperson, BookingDetailsDTO bookingdetails,int diffdays) throws PersonExceedException, RoomAlreadyBookedException, NoRoomAvailable; {
	 
	
	}
	Object cancelRoom(int id, Map<Integer, BookingDetailsDTO> cancelneedmap) throws CancelBookingException {
		
	}

}
