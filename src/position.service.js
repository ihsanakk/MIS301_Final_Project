import axios from "axios";


var baseUrl = "http://localhost:8090/"
class PositionService{

    getOpenPositions(){
        return axios.get(baseUrl+'openPositions');
    }
}

export default new PositionService();