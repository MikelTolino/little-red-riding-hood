/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.json.JSONObject;

/**
 *
 * @author juanangel
 */
public class Blossom extends AbstractGameObject {

    public Blossom() {
        super();
    }

    public Blossom(Position position, int value, int life) {
        super(position, value, life);
    }

    public Blossom(JSONObject obj) {
        super(obj);
    }

}