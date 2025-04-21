package oop.study;

// 공통 부모 클래스
class Player {
    protected String name;
    protected String position;
    Player(){};

    Player(String playerName, String playerPosition) {
        this.name = playerName;
        this.position = playerPosition;
    }

    void shoot() {
        System.out.println(position + " " + name + ": 기본 슛");
    }
}

class Sg extends Player {
    Sg() { position = "Shooting Guard";}


    Sg(String name) {
        super (name, "슈팅 가드");
    }

    void shoot() {
        System.out.println(position + " " + name + ": 3점슛!");
    }
}

class Pg extends Player {
    Pg(String name) {
        super(name, "포인트 가드");
    }

    void shoot() {
        System.out.println(position + " " + name + ": 돌파 후 점퍼!");
    }
}

class Center extends Player {
    Center(){

        position = "Center";}

    Center(String name) {
        super(name, "센터");
    }

    void shoot() {
        System.out.println(position + " " + name + ": 골밑슛!");
    }
}

class Pf extends Player {
    Pf(String name) {
        super(name, "파워 포워드");
    }

    void shoot() {
        System.out.println(position + " " + name + ": 미들슛!");
    }
}

class Sf extends Player {
    Sf(String name) {
        super(name, "스몰 포워드");
    }

    void shoot() {
        System.out.println(position + " " + name + ": 슬래시 앤 드라이브!");
    }
}

public class Slamdunk {
    public static void main(String[] args) {
        Player[] team = {
                new Pg("송태섭"),
                new Sg("정대만"),
                new Sf("서태웅"),
                new Pf("강백호"),
                new Center("채치수")
        };

        System.out.println("[ 팀 슛 연습 시작!]\n");

        for (Player p : team) {
            p.shoot(); // 오버라이딩된 shoot() 실행 (동적 바인딩)
        }

        Coach coach = new Coach();
        coach.train(new Sg());
        coach.train(new Center());
    }
}

class Coach {
    // 매개변수 타입: player -> 자식 클래스 모두 전달 가능
    void train(Player player) {
        System.out.print("훈련 중 ->");
        player.shoot(); // 동적 바인딩: 실제 객체의 shoot() 실행
    }
}
