package org.Codewars.kyu5;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {

        if(r<0){
            r = 0;
        }
        else if(r>255){
            r = 255;
        }
        if(g<0){
            g = 0;
        }
        else if(g>255){
            g = 255;
        }
        if(b<0){
            b = 0;
        }
        else if(b>255){
            b = 255;
        }

        return  String.format("%02X%02X%02X", r, g, b);
    }
}

//    if(r < 0) r = 0;
//        if(g < 0) g = 0;
//        if(b < 0) b = 0;
//        if(r > 255) r = 255;
//        if(g > 255) g = 255;
//        if(b > 255) b = 255;

//   return Stream.of(r, g, b)
//                .map(i -> Math.max(0, i))
//                .map(i -> Math.min(255, i))
//                .map(i -> String.format("%02X", i))
//                .collect(Collectors.joining());