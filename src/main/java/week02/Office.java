package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {
    public List<MeetingRoom> meetingRooms = new ArrayList<>();


    public void addMeetingRoom(MeetingRoom meetingRoom) {

        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("printNames");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNameReverse() {
        List<MeetingRoom> reverseMeetingRooms = new ArrayList<>();
        for (int i = (meetingRooms.size() - 1); i >= 0; i--) {
            reverseMeetingRooms.add(meetingRooms.get(i));
        }
        for (MeetingRoom reverseMeetingRoom : reverseMeetingRooms) {
            System.out.println(reverseMeetingRoom.getName());
        }
    }

    public void printEventNames() {
        int i = 0;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (i % 2 == 1) {
                System.out.println(meetingRoom.getName());
            }
            i++;
        }
    }

    public void printAreas() {
        System.out.println("Print Areas");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName() + "(" + meetingRoom.getWidth() + "*" + meetingRoom.getLength() + "=" + meetingRoom.getArea(meetingRoom.getLength(),meetingRoom.getWidth()) + ")");
        }
    }

    public void printMeetingRoomsWithName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a keresendő nevet: ");
        String name = scanner.nextLine();
        for (MeetingRoom meetingRooms : meetingRooms) {
            if (name.equals(meetingRooms.getName())) {
                System.out.println("Szélesség: " + meetingRooms.getWidth() + "  Hosszúság: " + meetingRooms.getLength() + " Terület:  " + meetingRooms.getLength() * meetingRooms.getWidth());
            }
        }
    }

    public void printMeetingRoomsContains() {
        System.out.println("Milyen szövegrészt tartalmazzon?");
        Scanner scanner=new Scanner(System.in);
        String meetingRoomContains = scanner.nextLine();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().indexOf(meetingRoomContains) > -1) {
                System.out.println(meetingRoom.getName() + "(" + meetingRoom.getWidth() + "*" + meetingRoom.getLength() + "=" + meetingRoom.getArea(meetingRoom.getLength(),meetingRoom.getWidth()) + ")");
            }
        }
    }

    public void printAreasLargerThan() {
        System.out.println("printAreasLargerThan");
        System.out.println("Mekkora területnél nagyobb? ");
        Scanner scanner=new Scanner(System.in);
        int area=scanner.nextInt();
        for(MeetingRoom meetingRoom:meetingRooms){
            if((meetingRoom.getWidth()*meetingRoom.getLength())>area){
                System.out.println(meetingRoom.getName() + "(" + meetingRoom.getWidth() + "*" + meetingRoom.getLength() + "=" + meetingRoom.getArea(meetingRoom.getLength(),meetingRoom.getWidth()) + ")");
            }
        }

    }

}

