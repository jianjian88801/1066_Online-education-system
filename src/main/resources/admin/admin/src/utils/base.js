const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootus5uu/",
            name: "springbootus5uu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootus5uu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微服务在线教育系统"
        } 
    }
}
export default base
