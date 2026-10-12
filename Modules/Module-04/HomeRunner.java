
class Room {

    int length;
    int breath;

    Room(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    int area() {
        return length * breath;
    }

}

class BedRoom extends Room {

    int height;

    BedRoom(int length, int breath, int height) {
        super(length, breath);
        this.height = height;
    }

    int volume() {
        return this.breath * this.length * this.height;
    }

}

class HomeRunner {

    public static void main(String args[]) {
        BedRoom bedroom = new BedRoom(20, 30, 45);
        int roomVolume = bedroom.volume();
        int roomArea = bedroom.area();
        System.out.println("room area is:" + roomArea);
        System.out.println("room volume is:" + roomVolume);
    }
}
