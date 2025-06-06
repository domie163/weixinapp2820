<template>
	<view class="content">
		<view class="logo" v-if="true">
			<image :style='{"boxShadow":"0 0 8rpx #444","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"0px","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20210329/bbef90178a8540a898c5dc6ce123859b.png","isShow":true,"height":"160rpx"}' src='http://codegen.caihongy.cn/20210329/bbef90178a8540a898c5dc6ce123859b.png' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yonghuming" type="text" class="uni-input" name="" placeholder="用户名" />
		</view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
                        <picker @change="huanzhexingbieChange" :value="huanzhexingbieIndex" :range="huanzhexingbieOptions">
                                <view :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='huanzhe'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shenfenzheng" type="text" class="uni-input" name="" placeholder="身份证" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishenggonghao" type="text" class="uni-input" name="" placeholder="医生工号" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishengxingming" type="text" class="uni-input" name="" placeholder="医生姓名" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
                        <picker @change="yishengsuoshukeshiChange" :value="yishengsuoshukeshiIndex" :range="yishengsuoshukeshiOptions">
                                <view :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.suoshukeshi?ruleForm.suoshukeshi:"请选择所属科室"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yiyuanmingzi" type="text" class="uni-input" name="" placeholder="医院名字" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
                        <picker @change="yishengyishengxingbieChange" :value="yishengyishengxingbieIndex" :range="yishengyishengxingbieOptions">
                                <view :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.yishengxingbie?ruleForm.yishengxingbie:"请选择医生性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishengnianling" type="text" class="uni-input" name="" placeholder="医生年龄" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view v-if="tableName=='yisheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(0, 0, 0, 0.6)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"8rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yishengyouxiang" type="text" class="uni-input" name="" placeholder="医生邮箱" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"rgba(68, 68, 68, 1)","backgroundColor":"rgba(26, 172, 25, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                huanzhexingbieOptions: [],
                                huanzhexingbieIndex: 0,
                                yishengsuoshukeshiOptions: [],
                                yishengsuoshukeshiIndex: 0,
                                yishengyishengxingbieOptions: [],
                                yishengyishengxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='huanzhe'){
                        	this.huanzhexingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.huanzhexingbieOptions[0]
			}
			if(this.tableName=='yisheng'){
                        	res = await this.$api.option(`keshi`,`keshi`,{});
                        	this.yishengsuoshukeshiOptions = res.data;
				this.ruleForm.suoshukeshi=this.yishengsuoshukeshiOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='yisheng'){
                        	this.yishengyishengxingbieOptions = "男,女".split(',');
				this.ruleForm.yishengxingbie=this.yishengyishengxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        huanzhexingbieChange(e) {
                                this.huanzhexingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.huanzhexingbieOptions[this.huanzhexingbieIndex]
                        },
                        // 下拉变化
                        yishengsuoshukeshiChange(e) {
                                this.yishengsuoshukeshiIndex = e.target.value
                                this.ruleForm.suoshukeshi = this.yishengsuoshukeshiOptions[this.yishengsuoshukeshiIndex]
                        },
                        // 下拉变化
                        yishengyishengxingbieChange(e) {
                                this.yishengyishengxingbieIndex = e.target.value
                                this.ruleForm.yishengxingbie = this.yishengyishengxingbieOptions[this.yishengyishengxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.yonghuming) && `huanzhe` == this.tableName){
					this.$utils.msg(`用户名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `huanzhe` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if(`huanzhe` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if((!this.ruleForm.yishenggonghao) && `yisheng` == this.tableName){
					this.$utils.msg(`医生工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yisheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.yishengnianling&&(!this.$validate.isIntNumer(this.ruleForm.yishengnianling))){
					this.$utils.msg(`医生年龄应输入整数`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				if(`yisheng` == this.tableName && this.ruleForm.yishengyouxiang&&(!this.$validate.isEmail(this.ruleForm.yishengyouxiang))){
					this.$utils.msg(`医生邮箱应输入邮件格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 80rpx;
}

</style>
