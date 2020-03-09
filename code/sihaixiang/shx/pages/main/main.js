// pages/main/main.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    indicatoDots: "true",
    autoplay: "true",
    interval: "5000",
    circular: "true",
    navarr: [
      {
        url: "/pages/logs/logs",
        img: "/img/5.png",
        text: "餐宴"
      },{
        url: "/pages/logs/logs",
        img: "/img/7.png",
        text: "名厨"
      },{
        url: "/pages/logs/logs",
        img: "/img/4.png",
        text: "坝坝宴"
      },{
        url: "/pages/logs/logs",
        img: "/img/6.png",
        text: "餐饮周边"
      }
    ]
  },
  
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;

    //向服务端发送参数并接受json，顶部轮播图
    wx.login({
      success(res) {
        if (res.code) {
          //发起网络请求
          wx.request({
            url: 'http://localhost:8080/shx/shx/banner',
            data: {
              id: 1
            },
            success(result) {
              console.log("result-banner-top")
              console.log(result)
              that.setData({
                bannertop: [
                  result.data.imgs[0].imgUrl,
                  result.data.imgs[1].imgUrl,
                  result.data.imgs[2].imgUrl
                ]
              })
            }
          })
        } else {
          console.log('登录失败！' + res.errMsg)
        }
      }
    })

    //向服务端发送参数并接受json，底部轮播图
    wx.login({
      success(res) {
        if (res.code) {
          //发起网络请求
          wx.request({
            url: 'http://localhost:8080/shx/shx/banner',
            data: {
              id: 2
            },
            success(result) {
              console.log("result-banner-bottom")
              console.log(result)
              that.setData({
                bannerbuttom: [
                  result.data.imgs[0].imgUrl,
                  result.data.imgs[1].imgUrl,
                  result.data.imgs[2].imgUrl
                ]
              })
            }
          })
        } else {
          console.log('登录失败！' + res.errMsg)
        }
      }
    })

    //向服务端发送参数并接受json，优选名厨部分
    wx.login({
      success(res) {
        if (res.code) {
          //发起网络请求
          wx.request({
            url: 'http://localhost:8080/shx/shx/cook',
            success(result) {
              console.log("result-cook")
              console.log(result)
              that.setData({
                cookarr: result.data
              })
            }
          })
        } else {
          console.log('登录失败！' + res.errMsg)
        }
      }
    })

    //向服务端发送参数并接受json，优选餐宴部分
    wx.login({
      success(res) {
        if (res.code) {
          //发起网络请求
          wx.request({
            url: 'http://localhost:8080/shx/shx/banquest',
            success(result) {
              console.log("result-banquest")
              console.log(result)
              that.setData({
                banquetarr: result.data
              })
            }
          })
        } else {
          console.log('登录失败！' + res.errMsg)
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})