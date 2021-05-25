public class Dinossauro {
    private int energia;
    private int velocidade;
    private String temperatura;
    private String humor;

    private boolean isAlive;

    public Dinossauro() {
        this.energia = 0;
        this.velocidade = 0;
        this.temperatura = "Normal";
        this.humor = "Neutro";
        this.isAlive = true;
    }

    public void pular() {
        if (this.energia == 0) {
            System.out.println("Ops, o dinossauro não pode pular, pois está sem energia!");
        } else if (this.energia >= 1) {
            System.out.println("O dinossauro pulou!");
            System.out.println("Ele ficou mais feliz!");
            if (this.humor.equals("Triste")) {
                this.humor = "Neutro";
            } else if (this.humor.equals("Neutro")) {
                this.humor = "Feliz";
            }
            System.out.println("-1 ponto de energia.");
            this.energia -= 1;
        }
    }

    public void correr() {
        if (this.temperatura != "Aquecido") {
            System.out.println("Ops, sem Sol o dinossauro não tem velocidade!");
        } else if (this.temperatura.equals("Aquecido")) {
            if (this.energia == 0) {
                System.out.println("Ops, o dinossauro não pode correr, pois está sem energia!");
            } else {
                System.out.println("O dinossauro está correndo!");
                System.out.println("Ele ficou mais feliz!");
                if (this.humor.equals("Triste")) {
                    this.humor = "Neutro";
                } else if (this.humor.equals("Neutro")) {
                    this.humor = "Feliz";
                }
                System.out.println("-1 ponto de energia.");
                System.out.println("+1 ponto de velocidade.");
                this.energia -= 1;
                this.velocidade += 1;
            }
        }
    }

    public void comer() {
        System.out.println("O dinossauro está comendo!");
        if (this.velocidade > 0) {
            System.out.println("Ele parou de correr!");
            this.velocidade = 0;
        }
        System.out.println("Ele ficou mais feliz!");
        if (this.humor.equals("Triste")) {
            this.humor = "Neutro";
        } else if (this.humor.equals("Neutro")) {
            this.humor = "Feliz";
        }
        System.out.println("+1 ponto de energia.");
        this.energia += 1;
    }

    public void brincar() {
        if (this.energia == 0) {
            System.out.println("Ops, o dinossauro não pode brincar, pois está sem energia!");
        } else if (this.energia >= 1) {
            System.out.println("O dinossauro está brincando!");
            if (this.velocidade > 0) {
                System.out.println("Ele parou de correr!");
                this.velocidade = 0;
            }
            System.out.println("Ele ficou mais feliz!");
            if (this.humor.equals("Triste")) {
                this.humor = "Neutro";
            } else if (this.humor.equals("Neutro")) {
                this.humor = "Feliz";
            }
            System.out.println("-1 ponto de energia.");
            this.energia -= 1;
        }
    }

    public void tomarSol() {
        System.out.println("O dinossauro está tomando Sol!");
        if (this.velocidade > 0) {
            System.out.println("Ele parou de correr!");
            this.velocidade = 0;
        }
        System.out.println("Ele ficou mais feliz!");
        if (this.humor.equals("Triste")) {
            this.humor = "Neutro";
        } else if (this.humor.equals("Neutro")) {
            this.humor = "Feliz";
        }
        System.out.println("A temperatura aumentou!");
        if (this.temperatura.equals("Com frio")) {
            this.temperatura = "Normal";
        } else if (this.temperatura.equals("Normal")) {
            this.temperatura = "Aquecido";
        }
    }

    public void ficarNaSombra() {
        System.out.println("O dinossauro está na sombra!");
        if (this.velocidade > 0) {
            System.out.println("Ele parou de correr!");
            this.velocidade = 0;
        }
        System.out.println("Ele ficou mais triste!");
        if (this.humor.equals("Feliz")) {
            this.humor = "Neutro";
        } else if (this.humor.equals("Neutro")) {
            this.humor = "Triste";
        }
        System.out.println("A temperatura abaixou!");
        if (this.temperatura.equals("Aquecido")) {
            this.temperatura = "Normal";
        } else if (this.temperatura.equals("Normal")) {
            this.temperatura = "Com frio";
        } else if (this.temperatura.equals("Com frio")) {
            System.out.println("GAME OVER!\nVocê matou o dinossauro causando hipotermia!");
            this.isAlive = false;
        }
    }

    public void mostrarStatus() {
        System.out.println(" >> Energia: " + this.energia);
        System.out.println(" >> Velocidade: " + this.velocidade);
        System.out.println(" >> Temperatura: " + this.temperatura);
        System.out.println(" >> Humor: " + this.humor);
    }

    public boolean isAlive() {
        return this.isAlive;
    }
}