package hn.js.jv.simple_tarea_junit_jordy;

import javax.swing.JOptionPane;

public class App {
	
    public static void main(String[] args)
    {
        Double area;
        String opcion;

        JOptionPane.showMessageDialog(null, "1- Área de un círculo \n2- Área de un cuadrado \n3- Área de un rectángulo \n4- Área de un triángulo", "Menú", JOptionPane.INFORMATION_MESSAGE);
        opcion = JOptionPane.showInputDialog("Elija una de las opciones, que sea de un rango del 1 al 4");

        if (opcion != null) {
            switch (opcion) {
                case "1":
                    Double radio = Double.parseDouble(JOptionPane.showInputDialog("Indique el radio de ese círculo"));
                    area = areaCi(radio);
                    JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
                    break;

                case "2":
                    Double lado = Double.parseDouble(JOptionPane.showInputDialog("Indique la medida de uno de los lados del cuadrado"));
                    area = areaCu(lado);
                    JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + area);
                    break;

                case "3":
                    Double base = Double.parseDouble(JOptionPane.showInputDialog("Indique la base del rectángulo"));
                    Double altura = Double.parseDouble(JOptionPane.showInputDialog("Indique la altura del rectángulo"));
                    area = areaRect(base, altura);
                    JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + area);
                    break;

                    
                case "4":
                    Double baseTri = Double.parseDouble(JOptionPane.showInputDialog("Indique la base del triángulo"));
                    Double alturaTri = Double.parseDouble(JOptionPane.showInputDialog("Indique la altura del triángulo"));
                    area = areaTri(baseTri, alturaTri);
                    JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor elija una opción entre 1 y 4", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    public static Double areaCi(Double radio) 
    {
        Double resp = 3.14*radio*radio; 
        return Math.round(resp*100.0)/100.0;
    }

    public static Double areaCu(Double lado) 
    {
        Double resp = lado*lado;
        return Math.round(resp*100.0)/100.0;
    }

    public static Double areaRect(Double base, Double altura) 
    {
        Double resp = base*altura;
        return Math.round(resp*100.0)/100.0; 
    }

    public static Double areaTri(Double base, Double altura)
    {
        Double resp = (base*altura)/2;
        return Math.round(resp*100.0)/100.0; 
    }
}

