package com.zybooks.irreduciblerepresentationscalculator;

public class TableData
{
    private String element;
    private Object[][] charTable;
    private String result;

    TableData(String element)
    {
        this.element = element;
        result = ""; // will be something like "2A1 + B2" eventually
        switch (element){
            case "c1":
                // Number of symmetry elements h = 1
                //  C1  E
                //  A   +1
                charTable = new Object[2][2];
                charTable[0][0] = 1;    charTable[0][1] = 1;
                charTable[1][0] = "A";  charTable[1][1] = 1;
                break;

            case "cs":
                // Number of symmetry elements	h = 2
                //  Cs  E   Oh
                //  A'  +1  +1
                //  A'' +1  -1
                charTable = new Object[3][3];
                charTable[0][0] = 2;    charTable[0][1] = 1; charTable[0][2] = 1;
                charTable[1][0] = "A'"; charTable[1][1] = 1; charTable[1][2] = 1;
                charTable[2][0] = "A''"; charTable[2][1] = 1; charTable[2][2] = -1;
                break;

            case "ci":
                // Number of symmetry elements	h = 2
                //  Ci  E   i
                //  Ag  +1  +1
                //  Au  +1  -1
                charTable = new Object[3][3];
                charTable[0][0] = 2;    charTable[0][1] = 1; charTable[0][2] = 1;
                charTable[1][0] = "Ag"; charTable[1][1] = 1; charTable[1][2] = 1;
                charTable[2][0] = "Au"; charTable[2][1] = 1; charTable[2][2] = -1;
                break;

            case "c2":
                // Number of symmetry elements	h = 2
                //  C2  E   C2
                //  A   +1  +1
                //  B   +1  -1
                charTable = new Object[3][3];
                charTable[0][0] = 2;    charTable[0][1] = 1; charTable[0][2] = 1;
                charTable[1][0] = "A"; charTable[1][1] = 1; charTable[1][2] = 1;
                charTable[2][0] = "B"; charTable[2][1] = 1; charTable[2][2] = -1;
                break;

            case "c3":
                // Number of symmetry elements  h = 3
                // Ask Professor
                break;

            case "c4":
                // Number of symmetry elements  h = 4
                // Ask Professor
                break;

            case "c5":
                // Number of symmetry elements  h = 5
                // Ask Professor
                break;

            case "c6":
                // Number of symmetry elements  h = 6
                // Ask Professor
                break;

            case "c2v":
                // c2v's charTable, first row is coefficients of E, C2, etc
                // other rows are the values in the table (A1's are +1, +1, +1, +1)
                // is a 2d object array because row names vary by element so have to store as String
                // charTable [0][0] stores the value used for h in the equation
                charTable = new Object[5][5];
                charTable[0][0] = 4;    charTable[0][1] = 1; charTable[0][2] = 1; charTable[0][3] = 1; charTable[0][4] = 1;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = -1; charTable[2][4] = -1;
                charTable[3][0] = "B1"; charTable[3][1] = 1; charTable[3][2] = -1; charTable[3][3] = 1; charTable[3][4] = -1;
                charTable[4][0] = "B2"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = -1; charTable[4][4] = 1;
                break;

            case "c3v":
                // c2v's charTable, first row is coefficients of E, C2, etc
                // other rows are the values in the table (A1's are +1, +1, +1, +1)
                // is a 2d object array because row names vary by element so have to store as String
                // charTable [0][0] stores the value used for h in the equation
                charTable = new Object[5][4];
                charTable[0][0] = 6;    charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 3;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = -1;
                charTable[3][0] = "E";  charTable[3][1] = 2; charTable[3][2] = -1; charTable[3][3] = 0;
                break;

            case "c4v":
                // Number of symmetry elements	h = 8
                // C4v	E	2C4(z)	C2	2v	2d
                // A1	+1	+1	+1	+1	+1
                // A2	+1	+1	+1	-1	-1
                // B1	+1	-1	+1	+1	-1
                // B2	+1	-1	+1	-1	+1
                // E	+2	0	-2	0	0
                charTable = new Object[6][6];
                charTable[0][0] = 8;    charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 1; charTable[0][4] = 2; charTable[0][5] = 2;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1; charTable[1][5] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = 1; charTable[2][4] = -1; charTable[2][5] = -1;
                charTable[3][0] = "B1"; charTable[3][1] = 1; charTable[3][2] = -1; charTable[3][3] = 1; charTable[3][4] = 1; charTable[3][5] = 1;
                charTable[4][0] = "B2"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = 1; charTable[4][4] = -1; charTable[4][5] = 1;
                charTable[5][0] = "E";  charTable[5][1] = 2; charTable[5][2] = 0; charTable[5][3] = -2; charTable[5][4] = 0; charTable[5][5] = 0;
                break;

            // shouldn't need the following because we don't have to do point groups w/cosine, but leaving in comments because it's already done and in case things change
            /*case "c5v":
                // Number of symmetry elements	h = 10
                // C5v	E	2C5 (z)	2(C5)2	5v
                // A1	+1	+1	+1	+1
                // A2	+1	+1	+1	-1
                // E1	+2	+2cos(2/5)	+2cos(4/5)	0
                // E2	+2	+2cos(4/5)	+2cos(2/5)	0
                charTable = new Object[5][5];
                charTable[0][0] = 10;   charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 2; charTable[0][4] = 5;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = 1; charTable[2][4] = -1;
                charTable[3][0] = "E1"; charTable[3][1] = 2; charTable[3][2] = 2*Math.cos(2*Math.pi/5); charTable[3][3] = 2*Math.cos(4*Math.pi/5); charTable[3][4] = 0;
                charTable[4][0] = "E2"; charTable[4][1] = 2; charTable[4][2] = 2*Math.cos(4*Math.pi/5); charTable[4][3] = 2*Math.cos(2*Math.pi/5); charTable[4][4] = 0;
                break;*/

            case "c6v":
                // Number of symmetry elements	h = 12
                // C6v	E	2C6 (z)	2C3 (z)	C2 (z)	3v	3d
                // A1	+1	+1	+1	+1	+1	+1
                // A2	+1	+1	+1	+1	-1	-1
                // B1	+1	-1	+1	-1	+1	-1
                // B2	+1	-1	+1	-1	-1	+1
                // E1	+2	+1	-1	-2	0	0
                // E2	+2	-1	-1	+2	0	0
                charTable = new Object[7][7];
                charTable[0][0] = 12;   charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 2; charTable[0][4] = 1; charTable[0][5] = 3; charTable[0][6] = 3;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1; charTable[1][5] = 1; charTable[1][6] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = 1; charTable[2][4] = 1; charTable[2][5] = -1; charTable[2][6] = -1;
                charTable[3][0] = "B1"; charTable[3][1] = 1; charTable[3][2] = -1; charTable[3][3] = 1; charTable[3][4] = -1; charTable[3][5] = 1; charTable[3][6] = -1;
                charTable[4][0] = "B2"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = 1; charTable[4][4] = -1; charTable[4][5] = -1; charTable[4][6] = 1;
                charTable[5][0] = "E1"; charTable[5][1] = 2; charTable[5][2] = -1; charTable[5][3] = -1; charTable[5][4] = 2; charTable[5][5] = 0; charTable[5][6] = 0;
                charTable[6][0] = "E2"; charTable[5][1] = 2; charTable[5][2] = -1; charTable[5][3] = -1; charTable[5][4] = 2; charTable[5][5] = 0; charTable[5][6] = 0;
                break;

            case "c2h":
                // Number of symmetry elements	h = 4
                // C2h	E	C2 (z)	i	h
                // Ag	+1	+1	+1	+1
                // Bg	+1	-1	+1	-1
                // Au	+1	+1	-1	-1
                // Bu	+1	-1	-1	+1
                charTable = new Object[5][5];
                charTable[0][0] = 4;    charTable[0][1] = 1; charTable[0][2] = 1; charTable[0][3] = 1; charTable[0][4] = 1;
                charTable[1][0] = "Ag"; charTable[1][1] = 1; charTable[1][2] = -1; charTable[1][3] = 1; charTable[1][4] = -1;
                charTable[2][0] = "Bg"; charTable[2][1] = 1; charTable[2][2] = -1; charTable[2][3] = 1; charTable[2][4] = -1;
                charTable[3][0] = "Au"; charTable[3][1] = 1; charTable[3][2] = 1; charTable[3][3] = -1; charTable[3][4] = -1;
                charTable[4][0] = "Bu"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = -1; charTable[4][4] = 1;
                break;

            case "c3h":
                break;

            case "c4h":
                break;

            case "c5h":
                break;

            case "c6h":
                break;

            case "d2":
                // Number of symmetry elements	h = 4
                // D2	E	C2 (z)	C2 (y)	C2 (x)
                // A	+1	+1	+1	+1
                // B1	+1	+1	-1	-1
                // B2	+1	-1	+1	-1
                // B3	+1	-1	-1	+1
                charTable = new Object[5][5];
                charTable[0][0] = 4;    charTable[0][1] = 1; charTable[0][2] = 1; charTable[0][3] = 1; charTable[0][4] = 1;
                charTable[1][0] = "A";  charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1;
                charTable[2][0] = "B1"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = -1; charTable[2][4] = -1;
                charTable[3][0] = "B2"; charTable[3][1] = 1; charTable[3][2] = -1; charTable[3][3] = 1; charTable[3][4] = -1;
                charTable[4][0] = "B3"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = -1; charTable[4][4] = 1;
                break;

            case "d3":
                // Number of symmetry elements	h = 6
                // D3	E	2C3 (z)	3C'2
                // A1	+1	+1	+1
                // A2	+1	+1	-1
                // E	+2	-1	0
                charTable = new Object[4][4];
                charTable[0][0] = 6;    charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 3;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = -1;
                charTable[3][0] = "E";  charTable[3][1] = 2; charTable[3][2] = -1; charTable[3][3] = 0;
                break;

            case "d4":
                // Number of symmetry elements	h = 8
                // D4	E	2C4 (z)	C2 (z)	2C'2	2C''2
                // A1	+1	+1	+1	+1	+1
                // A2	+1	+1	+1	-1	-1
                // B1	+1	-1	+1	+1	-1
                // B2	+1	-1	+1	-1	+1
                // E	+2	0	-2	0	0
                charTable = new Object[6][6];
                charTable[0][0] = 8;    charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 1; charTable[0][4] = 2; charTable[0][5] = 2;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1; charTable[1][5] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = 1; charTable[2][4] = -1; charTable[2][5] = -1;
                charTable[3][0] = "B1"; charTable[3][1] = 1; charTable[3][2] = -1; charTable[3][3] = 1; charTable[3][4] = 1; charTable[3][5] = 1;
                charTable[4][0] = "B2"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = 1; charTable[4][4] = -1; charTable[4][5] = 1;
                charTable[5][0] = "E";  charTable[5][1] = 2; charTable[5][2] = 0; charTable[5][3] = -2; charTable[5][4] = 0; charTable[5][5] = 0;
                break;

            case "d6":
                // Number of symmetry elements	h = 12
                // D6	E	2C6 (z)	2C3 (z)	C2 (z)	3C'2	3C''2
                // A1	+1	+1	+1	+1	+1	+1
                // A2	+1	+1	+1	+1	-1	-1
                // B1	+1	-1	+1	-1	+1	-1
                // B2	+1	-1	+1	-1	-1	+1
                // E1	+2	+1	-1	-2	0	0
                // E2	+2	-1	-1	+2	0	0
                charTable = new Object[7][7];
                charTable[0][0] = 12;   charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 2; charTable[0][4] = 1; charTable[0][5] = 3; charTable[0][6] = 3;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1; charTable[1][5] = 1; charTable[1][6] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = 1; charTable[2][4] = 1; charTable[2][5] = -1; charTable[2][6] = -1;
                charTable[3][0] = "B1"; charTable[3][1] = 1; charTable[3][2] = -1; charTable[3][3] = 1; charTable[3][4] = -1; charTable[3][5] = 1; charTable[3][6] = -1;
                charTable[4][0] = "B2"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = 1; charTable[4][4] = -1; charTable[4][5] = -1; charTable[4][6] = 1;
                charTable[5][0] = "E1"; charTable[5][1] = 2; charTable[5][2] = 1; charTable[5][3] = -1; charTable[5][4] = -2; charTable[5][5] = 0; charTable[5][6] = 0;
                charTable[6][0] = "E2"; charTable[5][1] = 2; charTable[5][2] = -1; charTable[5][3] = -1; charTable[5][4] = 2; charTable[5][5] = 0; charTable[5][6] = 0;
                break;

            case "d2d":
                // Number of symmetry elements	h = 8
                // D2d	E	2S4	C2 (z)	2C'2	2d
                // A1	+1	+1	+1	+1	+1
                // A2	+1	+1	+1	-1	-1
                // B1	+1	-1	+1	+1	-1
                // B2	+1	-1	+1	-1	+1
                // E	+2	0	-2	0	0
                charTable = new Object[6][6];
                charTable[0][0] = 8;    charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 1; charTable[0][4] = 2; charTable[0][5] = 2;
                charTable[1][0] = "A1"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1; charTable[1][5] = 1;
                charTable[2][0] = "A2"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = 1; charTable[2][4] = -1; charTable[2][5] = -1;
                charTable[3][0] = "B1"; charTable[3][1] = 1; charTable[3][2] = -1; charTable[3][3] = 1; charTable[3][4] = 1; charTable[3][5] = -1;
                charTable[4][0] = "B2"; charTable[4][1] = 1; charTable[4][2] = -1; charTable[4][3] = 1; charTable[4][4] = -1; charTable[4][5] = 1;
                charTable[5][0] = "E";  charTable[5][1] = 2; charTable[5][2] = 0; charTable[5][3] = -2; charTable[5][4] = 0; charTable[5][5] = 0;
                break;

            case "d3d":
                // Number of symmetry elements	h = 12
                // D3d	E	2C3	3C'2	i	2S6	3d
                // A1g	+1	+1	+1	+1	+1	+1
                // A2g	+1	+1	-1	+1	+1	-1
                // Eg	+2	-1	0	+2	-1	0
                // A1u	+1	+1	+1	-1	-1	-1
                // A2u	+1	+1	-1	-1	-1	+1
                // Eu	+2	-1	0	-2	+1	0
                charTable = new Object[7][7];
                charTable[0][0] = 12;    charTable[0][1] = 1; charTable[0][2] = 2; charTable[0][3] = 3; charTable[0][4] = 1; charTable[0][5] = 2; charTable[0][6] = 3;
                charTable[1][0] = "A1g"; charTable[1][1] = 1; charTable[1][2] = 1; charTable[1][3] = 1; charTable[1][4] = 1; charTable[1][5] = 1; charTable[1][6] = 1;
                charTable[2][0] = "A2g"; charTable[2][1] = 1; charTable[2][2] = 1; charTable[2][3] = -1; charTable[2][4] = 1; charTable[2][5] = 1; charTable[2][6] = -1;
                charTable[3][0] = "Eg";  charTable[3][1] = 2; charTable[3][2] = -1; charTable[3][3] = 0; charTable[3][4] = 2; charTable[3][5] = -1; charTable[3][6] = 0;
                charTable[4][0] = "A1u"; charTable[4][1] = 1; charTable[4][2] = 1; charTable[4][3] = 1; charTable[4][4] = -1; charTable[4][5] = -1; charTable[4][6] = -1;
                charTable[5][0] = "A2u"; charTable[5][1] = 1; charTable[5][2] = 1; charTable[5][3] = -1; charTable[5][4] = -1; charTable[5][5] = -1; charTable[5][6] = 1;
                charTable[6][0] = "Eu";  charTable[5][1] = 2; charTable[5][2] = -1; charTable[5][3] = 0; charTable[5][4] = -2; charTable[5][5] = 1; charTable[5][6] = 0;
                break;

            case "d4d":
                break;

            case "d5d":
                break;

            case "d6d":
                break;

            case "d2h":
                break;

            case "d3h":
                break;

            case "d4h":
                break;

            case "d5h":
                break;

            case "d6h":
                break;

            case "td":
                break;

            case "o":
                break;

            case "oh":
                break;

            default:
                charTable = null;
                break;
        }
    }

    public void calculate(int[] input)
    {
        // input is an array because the amount of args varies by element
        int h;
        if(charTable[0][0] instanceof Integer)
            h = (Integer) charTable[0][0];



    }

    public String getResult(){
        return result;
    }


}