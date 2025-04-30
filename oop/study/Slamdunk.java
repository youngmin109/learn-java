package oop.study;

// 공통 부모 클래스
class Player {
    String name;
    String position;


    Player(String pName, String pPosition) {
        this.name = pName;
        this.position = pPosition;
    }

    void shoot() {
        System.out.println(position + " " + name + ": 기본 슛");
    }
}

class Sg extends Player {
    Sg(String name) {
        super(name, "슈팅 가드");
    }
    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 3점 슛");
    }
}

class Pg extends Player {
    Pg(String name) {
        super(name, "포인트 가드");
    }
    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 돌파 후 점퍼!");
    }
}


class Center extends Player {
    Center(String name) {
        super(name, "센터");
    }
    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 골밑슛!");
    }

}


class Pf extends Player {
    Pf(String name) {
        super(name, "파워포워드");
    }
    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 미들슛!");
    }
}

class Sf extends Player {
    Sf(String name) {
        super(name, "스몰포워드");
    }
    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 슬래시 앤 드라이브");
    }
}
class Coach {
    void train(Player player) {
        System.out.print("훈련중 -> ");
        player.shoot();
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

        System.out.println("팀 슛 연습 시작!\n");

        for (Player p : team) {
            p.shoot(); // 오버라이딩 된 shoot()을 실행 (동적 바인딩)
        }

        Coach coach = new Coach();
        coach.train(new Sg("정대만"));
        coach.train(new Center("채치수"));

    }

}