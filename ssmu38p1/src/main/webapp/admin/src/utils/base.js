const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmu38p1/",
            name: "ssmu38p1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmu38p1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院挂号系统小程序"
        } 
    }
}
export default base
