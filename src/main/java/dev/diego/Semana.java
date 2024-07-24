package dev.diego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Semana {
    private List<String> dias;

    public Semana() {
        dias = new ArrayList<>();
    }

    public void crearDiasDeLaSemana() {
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }

    public List<String> getDias() {
        return new ArrayList<>(dias);
    }

    public int getLargo() {
        return dias.size();
    }

    public void eliminarDia(String dia) {
        dias.remove(dia);
    }

    public String getDia(int index) {
        if (index >= 0 && index < dias.size()) {
            return dias.get(index);
        } else {
            return null;
        }
    }

    public boolean existeDia(String dia) {
        return dias.contains(dia);
    }

    public void ordenarDiasAlfabeticamente() {
        Collections.sort(dias);
    }

    public void vaciarLista() {
        dias.clear();
    }
}
