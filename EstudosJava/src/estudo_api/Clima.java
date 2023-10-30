package estudo_api;
import com.google.gson.annotations.SerializedName;

public class Clima {
    @SerializedName("results")
    private Results results;
    
    public Results getResults(){
        return results;
    }

    public class Results {
        @SerializedName("city")
        public String cidade;
        @SerializedName("date")
        public String data;
        @SerializedName("temp")
        public int temperatura;
        @SerializedName("description")
        public String clima;

        public String getCidade() {
            return cidade;
        }

        public String getData() {
            return data;
        }

        public int getTemperatura() {
            return temperatura;
        }

        public String getClima() {
            return clima;
        }
 
    }
}
