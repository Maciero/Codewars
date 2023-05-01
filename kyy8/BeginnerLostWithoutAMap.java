package org.Codewars.kyy8;

import java.util.Arrays;

public class BeginnerLostWithoutAMap {
        public static int[] map(int[] arr) {
            return Arrays.stream(arr).map(streamElem -> streamElem * 2).toArray();
        }
}
