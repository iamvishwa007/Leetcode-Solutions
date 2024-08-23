class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0, n = words.length;

        while (i < n) {
            int curr = 0;
            int cntWords = 0;
            int ind = i;

            while (ind < n) {
                if (curr + words[ind].length() + cntWords > maxWidth) {
                    break;
                }
                curr += words[ind].length();
                cntWords++;
                ind++;
            }

            if (ind == n) {
                StringBuilder lastLine = new StringBuilder();
                for (int k = i; k < ind; k++) {
                    lastLine.append(words[k]).append(" ");
                }
                lastLine.deleteCharAt(lastLine.length() - 1);
                lastLine.append(" ".repeat(maxWidth - lastLine.length()));
                res.add(lastLine.toString());
                break;
            }

            int totalEmptySpace = maxWidth - curr;
            StringBuilder line = new StringBuilder();
            for (int k = i; k < ind; k++) {
                line.append(words[k]);
                if (k < ind - 1) {
                    int evenlySpace = cntWords > 1 ? (int) Math.ceil((double) totalEmptySpace / (cntWords - 1)) : totalEmptySpace;
                    line.append(" ".repeat(Math.min(evenlySpace, totalEmptySpace)));
                    totalEmptySpace -= evenlySpace;
                    cntWords--;
                }
            }

            if (cntWords == 1) {
                line.append(" ".repeat(totalEmptySpace));
            }

            res.add(line.toString());
            i = ind;
        }

        return res;
    }
}