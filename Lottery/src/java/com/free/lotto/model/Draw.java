package com.free.lotto.model;

public class Draw
{
    
    private int drawId;
    
    private String gameName;
    
    private String tags;

    public int getDrawId()
    {
        return drawId;
    }

    public void setDrawId(int drawId)
    {
        this.drawId = drawId;
    }

    public String getGameName()
    {
        return gameName;
    }

    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }

    public String getTags()
    {
        return tags;
    }

    public void setTags(String tags)
    {
        this.tags = tags;
    }
    
    public String toString() 
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Draw ID:-" + getDrawId() + " Game name:-" + getGameName() + " Tags:-" + getTags());
        return builder.toString();
    }

}
