/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import reader.criteria.Criterion;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class GutenbergReader {
    private List<String> lines;
    private Scanner reader;
    //private BufferedReader bf;

    public GutenbergReader(String address) throws IllegalArgumentException, MalformedURLException, IOException {
        URL crimeAndPunishment = new URL(address);
        this.reader = new Scanner(crimeAndPunishment.openStream());
        //this.bf = new BufferedReader(new InputStreamReader(crimeAndPunishment.openStream()));
        this.lines = new ArrayList<>();
        
        while(this.reader.hasNextLine()){
            this.lines.add(this.reader.nextLine());
        }
        
        this.reader.close();
    }

    public List<String> linesWhichComplyWith(Criterion c){
        List<String> complyingLines = new ArrayList<String>();

        for (String line : this.lines) {
            if (c.complies(line)) {
                complyingLines.add(line);
            }
        }

        return complyingLines;
    }
}
